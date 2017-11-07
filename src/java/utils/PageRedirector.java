/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.context.FacesContext;

/**
 *
 * @author IrbeinTepes
 */
public class PageRedirector {
    
    public static void redirect(String url){
        try {
            FacesContext.getCurrentInstance().getExternalContext().redirect(url);
        } catch (IOException ex) {
            System.out.println("ERRO NA URL");
            Logger.getLogger(PageRedirector.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
