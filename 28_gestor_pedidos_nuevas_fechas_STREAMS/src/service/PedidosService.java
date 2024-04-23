package service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import model.Pedido;

public class PedidosService {
	HashSet<Pedido> pedidos=new HashSet<>();
	
	public void nuevoPedido(Pedido pedido) {
		pedidos.add(pedido);
	}
	
	// Devolver el pedido más reciente, pero si hubiera más de uno
	//que cumpla esa condición (misma fecha), que devuelva el que tiene más unidades
	public Optional<Pedido> pedidoMasReciente() {
		/*Pedido pAux=null;
		LocalDate fMax=LocalDate.of(0,1,1); //1/1/1970
		for(Pedido p:pedidos) {
			//si encontramos pedido con fecha más reciente que fMax
			//actualizamos fMax y pAux
			if(p.getFechaPedido().isAfter(fMax)) {
				fMax=p.getFechaPedido();
				pAux=p;
			}
		}
		return pAux;*/
		// Devolver el pedido más reciente, pero si hubiera más de uno
		//que cumpla esa condición (misma fecha), que devuelva el que tiene más unidades
		return pedidos.stream()//Stream<Pedido>
				//.max(Comparator.comparing(p->p.getFechaPedido()))
				.max(Comparator.comparing((Pedido p)->p.getFechaPedido())
					.thenComparingInt(p->p.getUnidades()));
				//.max((a,b)->a.getFechaPedido().compareTo(b.getFechaPedido()))
				//.orElse(null);
		
	}
	
		public List<Pedido> pedidosEntreFechas(LocalDate f1, LocalDate f2) {
			/*ArrayList<Pedido> aux=new ArrayList<Pedido>();
			for(Pedido p:pedidos) {
				//si fecha del pedido es posterior o igual a f1 y anterior o igual a f2, se incluye
				if(p.getFechaPedido().compareTo(f1)>=0&&p.getFechaPedido().compareTo(f2)<=0) {
					aux.add(p);
				}
			}
			return aux;*/
			return (pedidos.stream()
					.filter(p->p.getFechaPedido().compareTo(f1)>=0&&p.getFechaPedido().compareTo(f2)<=0))
					.collect(Collectors.toList());
		}
		
		public Pedido pedidoCercano(LocalDate f1) {
	//		Pedido aux=new Pedido();
	//		long dias=0; 
	//		long dias2=0;
	//		for(Pedido p:pedidos) {
	//			if (aux.getFechaPedido() == null) {
	//				aux=p;
	//				dias = Math.abs(ChronoUnit.DAYS.between(aux.getFechaPedido(), f1));
	//				/*if (dias<0) {
	//					dias=dias * -1;
	//				}*/
	//			}else {
	//				dias2 = Math.abs(ChronoUnit.DAYS.between(p.getFechaPedido(), f1));
	//				/*if (dias2<0) {
	//					dias2=dias2 * -1;
	//				}*/
	//				if (dias2<dias) {
	//					aux=p;
	//					dias=dias2;
	//				}
	//			}
	//		}
	//		return aux;*/
			
			return pedidos.stream()
					//.min((a, b) -> Math.abs(a.getFechaPedido().compareTo(f1)) - Math.abs(b.getFechaPedido().compareTo(f1)))
	                .min(Comparator.comparingLong(p->Math.abs(ChronoUnit.DAYS.between(p.getFechaPedido(), f1))))
					.orElse(null);
					
		}
		
		//Devuelve la lista de pedidos del producto recibido como parámetro
		public List<Pedido> listaProductos (String producto) {
			return pedidos.stream()
					.filter(a->a.getProducto().equals(producto))
					.collect(Collectors.toList());				
		}
				
		// Devuelve el pedido con menor número de unidades. Si hay más de uno.
		// devuelve el primero que encuentre.
		public Optional<Pedido> pedidoMenorUnidades() {
			return pedidos.stream()
					.min(Comparator.comparingInt(a->a.getUnidades()));
		}
		
		// Devuelve una cadena con los nombres de todos los productos sin duplicar.
		// separados con un guion -
		publid String nombresProductos () {
			return pedidos.stream()
					.map(p->p.getProducto()) // Stream <String>
					.distinct()
					.collect(Collectors.joining("-"));
			
		}
}
