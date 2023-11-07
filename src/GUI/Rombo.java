
package GUI;

public class Rombo {
    private double diagonalMayor;
    private double diagonalMenor;
    private double lados;
    
    public Rombo(){ }
    
    public Rombo(double ma, double me){
        this.diagonalMayor=ma;
        this.diagonalMenor=me;
    }
    
    public void setDiaMay(double ma){         
        this.diagonalMayor = ma;     
    } 
    
    public void setDiaMen(double me){         
        this.diagonalMenor = me;     
    } 
    
    public double getDiaMay(){         
        return this.diagonalMayor;     
    }
    
    public double getDiaMen(){         
        return this.diagonalMenor;     
    }
    
    public double getlados(){         
        return this.lados= Math.sqrt((Math.pow(this.diagonalMayor/2.0, 2.0))+(Math.pow(this.diagonalMenor/2.0, 2.0)));     
    }

    public double area(){             
        return this.diagonalMayor*this.diagonalMenor/2;      
    } 
    
    public double perimetro(){             
        return this.lados*4;      
    }   
}
