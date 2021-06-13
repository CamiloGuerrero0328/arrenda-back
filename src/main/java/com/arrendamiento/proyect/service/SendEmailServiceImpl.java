package com.arrendamiento.proyect.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import com.arrendamiento.proyect.domain.*;

@Service
@Scope("singleton")
public class SendEmailServiceImpl {
	
	@Autowired
	private JavaMailSender javaMailSender;

	public void sendOpenAccount(String receptor, Inmueble inmueble) {

		SimpleMailMessage simpleMailMessage = new SimpleMailMessage();

		String mensaje = "Has creado un nuevo inmueblede de tipo " + inmueble.getTipoInmueble()
				+ ", Con direccion " + inmueble.getDireccion() + " Y descripcion: "+ inmueble.getDescripcion();

		simpleMailMessage.setTo(receptor);
		simpleMailMessage.setSubject("Creacion Inmueble:" + inmueble.getTipoInmueble());
		simpleMailMessage.setText(mensaje);

		javaMailSender.send(simpleMailMessage);
	}
	
	public void notificationAvisoInmuebleArrendatario(String receptor, Proceso proceso) {

		SimpleMailMessage simpleMailMessage = new SimpleMailMessage();

		String mensaje = "Has aplicado al inmueble de tipo "
				+ proceso.getInmueble().getTipoInmueble() + ", con direccion " 
				+ proceso.getInmueble().getDireccion() + " y descripcion; "
				+ proceso.getInmueble().getDescripcion();

		simpleMailMessage.setTo(receptor);
		simpleMailMessage.setText(mensaje);

		javaMailSender.send(simpleMailMessage);
	}
	
	public void notificationPagoCannon(String receptor, Transaction transaction) {
		
		SimpleMailMessage simpleMailMessage = new SimpleMailMessage();

		String mensaje = "Han pagado el cannon de mes: "
				+ transaction.getFecha() + ", de inmueble tipo: " 
				+ transaction.getInmueble().getTipoInmueble() + " y direccion; "
				+ transaction.getInmueble().getDireccion() + " Y cliente: "
				+ transaction.getCliente().getNombreCliente()+ " " 
				+ transaction.getCliente().getApellidoCliente();
		
		simpleMailMessage.setTo(receptor);
		simpleMailMessage.setText(mensaje);

		javaMailSender.send(simpleMailMessage);
	}
	
	public void notificationAvisoInmuebleArrendador(String receptor, Proceso proceso) {

		SimpleMailMessage simpleMailMessage = new SimpleMailMessage();

		String mensaje = "Han aplicado a tu inmueble: " + proceso.getInmueble().getDireccion() + ", " 
		+ proceso.getInmueble().getDescripcion() + ", Y el cliente es: " + 
				proceso.getCliente().getNombreCliente();

		simpleMailMessage.setTo(receptor);
		simpleMailMessage.setText(mensaje);

		javaMailSender.send(simpleMailMessage);
	}

}
