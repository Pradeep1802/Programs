import javax.mail.*;
import java.io.IOException;
import java.util.Properties;
import java.lang.*;

 
public class ReadMailsFromExchange {


    public static void main(String[] args) throws MessagingException,IOException {
    	ReadMailsFromExchange obj1= new ReadMailsFromExchange();
    	obj1.doTest();
    	System.out.println("Ok");
       }
    	
    	
    public void doTest() throws MessagingException, IOException {

    	        final String username = "bpradeep@businessonetech.com";
    	        final String passwd = "";
    	        Properties props = new Properties();
    	        props.put("mail.host", "outlook.office365.com");
    	        props.put("mail.store.protocol", "pop3s");
    	        props.put("mail.pop3s.auth", "true");
    	        props.put("mail.pop3s.port", "995");


    	        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
    	        protected PasswordAuthentication getPasswordAuthentication() {
    	             return new PasswordAuthentication(username, passwd);
    	            }
    	        });

    	        Store store = session.getStore("pop3s");
    	        store.connect();
    	        Folder emailFolder = store.getFolder("INBOX");
     	        emailFolder.open(Folder.READ_ONLY);

    	        // retrieve the messages from the folder in an array and print it
    	        Message[] messages = emailFolder.getMessages();
    	        System.out.println("messages.length---" + messages.length);
    	        

    	        for (int i = 0, n = messages.length; i < n; i++) 
    	            Message message = messages[i];
    	            
    	            if (message.getSubject().contentEquals("Sandbox: Verify your identity in Salesforce")) {
    	            {
    	            //if (message.getFrom()[0].toString() == "noreply@salesforce.com") 
    	            System.out.println("---------------------------------");
    	            System.out.println("Email Number " + (i + 1));
    	            System.out.println("Subject: " + message.getSubject());
    	            System.out.println("From: " + message.getFrom()[0]);
    	        }

    	        //close the store and folder objects
    	        emailFolder.close(false);
    	        store.close();


    	    }
   }
}
}

       
   


