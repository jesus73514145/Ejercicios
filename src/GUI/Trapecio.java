
package GUI;

public class Trapecio {
    private double baseMayor;
    private double baseMenor;
    private double ladosInclinado;
    private double altura;
    
    public Trapecio(){ }
    
    public Trapecio(double ma, double me, double incli){ 
        this.baseMayor=ma;
        this.baseMenor=me;
        this.ladosInclinado=incli;          
    }
    
    public void setBaseMayor(double baMa){         
        this.baseMayor = baMa;     
    } 
    
    public void setBaseMenor(double baMe){         
        this.baseMenor = baMe;     
    } 
    
    public void setLadosI(double la){         
        this.ladosInclinado = la;     
    } 
    
    public double getBaseMayor(){         
        return this.baseMayor;     
    }
    
    public double getBaseMenor(){         
        return this.baseMenor;     
    }
    
    public double getLadosI(){         
        return this.ladosInclinado;     
    }
    
    public double getAltura(){  
        double cateto=(this.baseMayor-this.baseMenor)/2;
        return this.altura= Math.sqrt( Math.pow(this.ladosInclinado,2) - Math.pow(cateto,2)  );     
    }
     
    public double area(){             
        return ((this.baseMayor+this.baseMenor)*this.altura )/2;      
    } 
    
    public double perimetro(){             
        return 2*this.ladosInclinado+this.baseMayor+this.baseMenor;      
    } 
}
