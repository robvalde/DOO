/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Jorge Samuel Ruan Monsivais
 */
public class Registro extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String nombre = request.getParameter("txt-nombre");
            String mail = request.getParameter("txt-mail");
            String usuario = request.getParameter("txt-usuario");
            String contraseña = request.getParameter("txt-contraseña");
            String mes = request.getParameter("Mes");
            String masculino = request.getParameter("radio-masculino");
            String femenino = request.getParameter("radio-femenino");
            String mayor = request.getParameter("radio-mayor");
            String acercademi = request.getParameter("acercademi");
            String limpiarUsuario = limpiar(nombre, mail, usuario, contraseña, mes, masculino, femenino, mayor, acercademi);
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Registro</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<p>Nombre: " + nombre + "</p>");
            out.println("<p>E-mail: " + mail + "</p>");
            out.println("<p>Usuario: " + usuario + "</p>");
            out.println("<p>Mes de Nacimiento: " + mes + "</p>");
            out.println("<p>Sexo Maculino: " + masculino + "</p>");
            out.println("<p>Sexo Femenino: " + femenino + "</p>");
            out.println("<p>Mayor de edad: " + mayor + "</p>");
            out.println("<p>Acerca del usuario: " + acercademi + "</p>");
            out.print("<a href='registro.html'>Regresar</a>");
            out.println("</body>");
            out.println("</html>");
        }
    }


    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private String limpiar(String nombre, String mail, String usuario, String contraseña, String mes, String masculino, String femenino, String mayor, String acercademi) {
        try{
            String encodeNombre = URLEncoder.encode(nombre, "UTF-8");
            String encodeMail = URLEncoder.encode(mail, "UTF-8");
            String encodeUsuario = URLEncoder.encode(usuario, "UTF-8");
            String encodeContraseña = URLEncoder.encode(contraseña, "UTF-8");
            String encodeMes = URLEncoder.encode(mes, "UTF-8");
            String encodeMasculino = URLEncoder.encode(masculino, "UTF-8");
            String encodeFemenino = URLEncoder.encode(femenino, "UTF-8");
            String encodeMayor = URLEncoder.encode(mayor, "UTF-8");
            String encodeAcercademi = URLEncoder.encode(acercademi, "UTF-8");
        }catch(UnsupportedEncodingException e){
            return null;
        }
        return null;
    }

}
