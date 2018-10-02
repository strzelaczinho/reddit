/*
This is a simple web frontend and web server (CGI, PHP, servlet, server component, etc.) exercise.
Write a web frontend that contains a text area and button. Then write a program that accepts the contents of the text area and writes them out to a file. 
When the user clicks the button, the submission of the content can be either form-based, AJAX-based, or even websockets-based.
You can complete this project in several ways. You can write up the HTML yourself and submit the form to a program written in C/C++, Perl, Python, PHP, etc. 
You can do all the work in Javascript and hit a server using Node.js. You can also show off how easy it is to do this project using a Java/Python/Ruby/etc. web framework.
 */
package CHALLENGE_29_INTERMIEDIATE_WEB_SERWER;

/**
 *
 * @author adam
 */
  import java.io.*;
    import java.util.*;
    import java.net.*;

    public class SimplestServer
    {
        public SimplestServer(final int port) throws Exception {
            final ServerSocket serv = new ServerSocket(port);
            while (true) handleRequest(serv.accept());
        }

        final String HEADER = "HTTP/1.0 200 OK\r\nContent-Type: text/html\r\nContent-Length: %s\r\n\r\n",
                     THANKS = "<html><title>SimplestServer</title><body>Thank You</body></html>",
                     FORM = "<html><title>SimplestServer</title><body>" +
                            "<form method=\"POST\"><textarea name=\"mytext\"></textarea>" +
                            "<input type=\"submit\" value=\"Go\" /></form>" +
                            "</body></html>";

        void handleRequest(Socket s) throws Exception {
            final InputStream in = s.getInputStream();
            final byte[] buf = new byte[32 * 1024];
            int pos = in.read(buf, 0, buf.length);
            while (in.available() > 0) {
                pos += in.read(buf, pos, buf.length - pos);
            }
            final String strBuf = new String(buf, 0, pos);
            final String method = strBuf.substring(0, strBuf.indexOf(" "));
            final OutputStream out = s.getOutputStream();
            if (method.equals("GET")) {
                final String msg = 
                        HEADER.replace("%s", "171") + FORM;
                out.write(msg.getBytes());
                System.out.println("Sent form\r\n");
            }
            else if (method.equals("POST")) {
                final String postData = strBuf.split("\r\n\r\n")[1];
                System.out.println(postData);
                FileWriter fw = new FileWriter("" + System.currentTimeMillis());
                fw.write(postData);
                fw.close();
                out.write((HEADER.replace("%s", "64") + THANKS).getBytes());
                System.out.println("Sent thanks\r\n");
            }
            s.close();
        }

        static public class Driver {
            public static void main(String[] args) throws Exception {
                new SimplestServer(12348);
            }
        }
    }