<%-- 
    Document   : cancelMail
    Created on : May 4, 2021, 10:45:00 PM
    Author     : Windows7
--%>

<%@ page import="java.util.*,javax.mail.*"%>

<%@ page import="javax.mail.internet.*" %>

<%
//Creating a result for getting status that messsage is delivered or not!

    String result;

    // Get recipient's email-ID, message & subject-line from index.html page

    

    final String subject ="Order Canceled Successfully...!"; //request.getParameter("sub");
    
    String nm = request.getParameter("name");
    String un = request.getParameter("uid");
    String m = request.getParameter("m");

    
    final String messg ="Dear, " +nm+ " Your Request For Cancel Order Submited Successfully... \n with invoice no."+un+"";

    
   // final String messg ="Hi";//"Dear, " + owner + " \n Your appointment for "+dates+" "+ time +" has been changed by our veterians please kindly note down.\n Sorry for our inconvenience";

    final String to =m;

    // Sender's email ID and password needs to be mentioned

    final String from = "farmerbuddy01@gmail.com";

    final String pass = "farmer@123";

    // Defining the gmail host

    String host = "smtp.gmail.com";

 

    // Creating Properties object

    Properties props = new Properties();

 

    // Defining properties

    props.put("mail.smtp.host", host);

    props.put("mail.transport.protocol", "smtp");

    props.put("mail.smtp.auth", "true");

    props.put("mail.smtp.starttls.enable", "true");

    props.put("mail.user", from);

    props.put("mail.password", pass);

    props.put("mail.port", "443");

 

    // Authorized the Session object.

    Session mailSession = Session.getInstance(props, new javax.mail.Authenticator() {

        @Override
        protected PasswordAuthentication getPasswordAuthentication() {

            return new PasswordAuthentication(from, pass);

        }

    });

    
    try {

        // Create a default MimeMessage object.

        MimeMessage message = new MimeMessage(mailSession);

        // Set From: header field of the header.

        message.setFrom(new InternetAddress(from));

        // Set To: header field of the header.

        message.addRecipient(Message.RecipientType.TO,

        new InternetAddress(to));

        // Set Subject: header field

        message.setSubject(subject);

        // Now set the actual message

        message.setText(messg);

        // Send message

        Transport.send(message);
        
        response.sendRedirect("index.jsp");

        result = "Your mail sent successfully....";

    } catch (MessagingException mex) {

        mex.printStackTrace();

        result = "Error: unable to send mail....";

    }
//response.sendRedirect("dHome.jsp");
%>
