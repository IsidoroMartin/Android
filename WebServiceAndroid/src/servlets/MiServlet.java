package servlets;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

//@Path("servlet")
public class MiServlet extends HttpServlet {
//	@GET
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("GET");
		resp.setContentType("text/plain");
		PrintWriter out = (PrintWriter)resp.getWriter();
		out.write("Hello Android");
	}
//	@POST
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("POST");
		BufferedReader br = req.getReader();
		String enviado = br.readLine();
		System.out.println("Hemos Recibido = "+enviado);
		PrintWriter pw = resp.getWriter();
		pw.write("Hola Android POST");
	}
}
