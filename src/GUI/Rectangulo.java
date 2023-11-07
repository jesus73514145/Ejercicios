
package GUI;

public class Rectangulo {
    private double base;
    private double altura;
    
    public Rectangulo(){}
    
    public Rectangulo(double bas, double alt){
        this.base=bas;
        this.altura=alt;
    }
    
    public double getBase()  {         
        return this.base;     
    }
    
    public double getAltura()  {         
        return this.altura;     
    }
    
    public void setBase(double ba)  {         
        this.base = ba;     
    } 
    
    public void setAltura(double h)  {         
        this.altura = h;     
    } 
    
    public double area()  {             
        return this.base*this.altura;      
    } 
    
    public double perimetro()  {             
        return 2*(this.base+this.altura);      
    } 
}
