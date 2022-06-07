/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads;

import MyVariousUtils.FichierLog;
import java.text.DateFormat;
import java.util.Date;
import javax.swing.JLabel;

/**
 *
 * @author Nohch
 */
public class DateTimeThread extends Thread {

    private JLabel labelAffichage;
    private DateFormat format;
    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    public DateTimeThread(JLabel labelAffichage, DateFormat format) {
        this.labelAffichage = labelAffichage;
        this.format = format;
    }

    public DateFormat getFormat() {
        return format;
    }

    public void setFormat(DateFormat format) {
        this.format = format;
    }

    
    @Override
    public void run() {
        while(true)
        {
            try{
                labelAffichage.setText(format.format(new Date()));
                Thread.sleep(1000);
            }
            catch(InterruptedException ex)
            {
                FichierLog fLog = new FichierLog("log/logsGarage");
                fLog.writeLine("Interruption dans thread DateTimeThread! :: " + ex.getLocalizedMessage());
            }
        }
    }

    
}
