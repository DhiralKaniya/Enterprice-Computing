/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InventoryController.Action;

import InventoryController.ActionInterface;
import InventoryDAO1.InventoryCategory;
import InventoryDAO1.InventoryDAO;
import UserDefineException1.DAOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author dhiral
 */
public class allcategory implements ActionInterface{
    @Override
    public String actionPerfrom(HttpServletRequest request, HttpServletResponse response) throws ServletException {
        InventoryDAO myDAO = (InventoryDAO)request.getServletContext().getAttribute("InventoryDAO");
        try{
            InventoryCategory[] mycategory = myDAO.viewCategory();
            //System.out.println("view.jsp");
            request.setAttribute("mycategory", mycategory);
            return "view.jsp";
        }catch(DAOException e){
            System.out.println(e);
            return "index.jsp";
        }
    }
    
}
