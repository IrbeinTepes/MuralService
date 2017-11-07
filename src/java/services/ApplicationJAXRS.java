//package services;
//
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.Map;
//import java.util.Set;
//
//import javax.ws.rs.core.Application;
//import org.glassfish.jersey.jettison.JettisonFeature;
//
//import org.glassfish.jersey.media.multipart.MultiPartFeature;
//import org.glassfish.jersey.server.ResourceConfig;
//
//
//public class ApplicationJAXRS extends Application{
//
//	
//	@Override
//	public Map<String, Object> getProperties() {
//		Map<String, Object> properties = new HashMap<>();
//		properties.put("jersey.config.server.provider.packages", "services");
//		return properties;
//	}
//	//se der erro de injeção de contexto add aqui a parada
//	@Override
//	public Set<Object> getSingletons() {
//		Set<Object> singletons = new HashSet<>();
////		singletons.add(new JettisonFeature());
//              singletons.add(new MultiPartFeature()); 
//		
//		return singletons;
//	}
//	
//	
//}
