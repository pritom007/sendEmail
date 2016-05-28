/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sendmail;

import java.io.IOException;
import java.util.Date;
import java.util.Properties;
import java.util.Scanner;

import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;


public class SendEmail extends Object{

public static void main(String [] args)
{
    /*
     *sender's email should be yahoo
     */
    //agr1=your email,arg2=password(according to your email),
    //arg3=recevier's email address,arg4=subject
    //arg5=your message
    testMail t=new testMail("youremail@yahoo.com","password","14302016002@fudan.edu.cn","subject","body");
    
}
}