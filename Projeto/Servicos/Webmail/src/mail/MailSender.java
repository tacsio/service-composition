package mail;
import org.apache.commons.mail.SimpleEmail;



public class MailSender {

	private SimpleEmail email;
	public MailSender() {
		email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
	}
	
	public String send(String to, String from, String subject, String msg){
		try {
			System.out.println("Webmail Request Received");
			email.setSSL(true);
			email.setSmtpPort(465);
			email.setAuthentication("tacsioo@gmail.com", "qwe12345**");//PARAMETROS (CONTA_EMAIL, SENHA)
			email.addTo(to);
			email.setFrom(from);
			email.setSubject(subject);
			email.setMsg(msg);
			email.send();
			
			return "Email enviado com sucesso";
		} catch (Exception e) {
			e.printStackTrace();
			return "INTERNAL ERROR";
		}
	}
}
