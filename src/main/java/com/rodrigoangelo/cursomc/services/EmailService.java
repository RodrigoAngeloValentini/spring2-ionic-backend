package com.rodrigoangelo.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.rodrigoangelo.cursomc.domain.Cliente;
import com.rodrigoangelo.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);

	void sendNewPasswordEmail(Cliente cliente, String newPass);
}