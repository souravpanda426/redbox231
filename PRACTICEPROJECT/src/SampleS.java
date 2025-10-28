class Main {
  public static void main(String[] args) {
    
    int[] x = {5,10,12,9,6,3};
    
    int max = -1;
    int secondmax=-1;
    
    for(int i=0;i<x.length;i++){
        
        if(max<x[i]){
            
            secondmax=max;
            max=x[i];
        }
        
        else if(secondmax<x[i]){
            
            secondmax=x[i];
        }
    }
    
    System.out.println(secondmax);
        
    }
    

    
    
    
  }
