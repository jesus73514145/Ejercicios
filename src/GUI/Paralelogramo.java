
package GUI;

public class Paralelogramo {
    private double base;
    private double altura;
    private double ladInclinado;
    
    public Paralelogramo(){}
    
    public Paralelogramo(double ba, double h, double LaIncli){
        this.base=ba;
        this.altura=h;
        this.ladInclinado=LaIncli;     
    }
    
    public double getBase()  {         
        return this.base;     
    }
    
    public double getAltura()  {         
        return this.altura;     
    }
    
    public double getLadoI()  {         
        return this.ladInclinado;     
    }
    
    public void setBase(double ba)  {         
        this.base = ba;     
    } 
    
    public void setAltura(double h)  {         
        this.altura = h;     
    }
    
    public void setLadoI(double la)  {         
        this.ladInclinado = la;     
    } 
    
    public double area()  {             
        return this.base*this.altura;      
    } 
    
    public double perimetro()  {             
        return 2*(this.base+this.ladInclinado);      
    } 
     
}
