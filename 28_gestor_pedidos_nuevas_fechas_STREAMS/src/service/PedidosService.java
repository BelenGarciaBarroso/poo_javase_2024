package service;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

import model.Pedido;

public class PedidosService {
	HashSet<Pedido> pedidos=new HashSet<>();
	
	public void nuevoPedido(Pedido pedido) {
		pedidos.add(pedido);
	}
	
	public Pedido pedidoMasReciente() {
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
		return pedidos.stream()//Stream<Pedido>
				//.max(Comparator.comparing(p->p.getFechaPedido()))
				.max((a,b)->a.getFechaPedido().compareTo(b.getFechaPedido()))
				.orElse(null);
		
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
				.min((a, b) -> Math.abs(a.getFechaPedido().compareTo(f1)) - Math.abs(b.getFechaPedido().compareTo(f1)))
                .orElse(null);
				
	}
}
