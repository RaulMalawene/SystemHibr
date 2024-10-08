 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula03_lista;


public class ListaLigada {
    private Elemento ultimo;
    private Elemento primeiro;
    private int tamanho;

    public ListaLigada() {
        this.tamanho=0;
        
    }
    
    
    

    public Elemento getUltimo() {
        return ultimo;
    }

    public void setUltimo(Elemento ultimo) {
        this.ultimo = ultimo;
    }

    public Elemento getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(Elemento primeiro) {
        this.primeiro = primeiro;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    
    public void adicionar(String novoValor){
        Elemento novoElemento=new Elemento(novoValor);
        if (this.primeiro==null && this.ultimo==null){
            this.primeiro=novoElemento;
            this.ultimo=novoElemento;
            tamanho++;
        }else{
            this.ultimo.setProximo(novoElemento);
            this.ultimo= novoElemento;
             this.tamanho++;
        }
     
}
    public void adicionarComeco(String novoValor){
    Elemento novoElemento = new Elemento(novoValor);
    if(this.primeiro== null && this.ultimo==null){
       primeiro=novoElemento;
         ultimo=novoElemento;
    }else{
        novoElemento.setProximo(this.primeiro);
        this.primeiro = novoElemento;
    
    }
    this.tamanho ++;
    }

    public void remover (String valorProcurado){
        Elemento anterior =null;
        Elemento atual= this.primeiro;
        for(int i=0; i< this.getTamanho(); i++){
        if(atual.getValor().equalsIgnoreCase(valorProcurado)){
            if(this.tamanho ==1){
                this.primeiro= null;
                this.ultimo=null;
            }else if(atual == primeiro){
                this.primeiro=atual.getProximo();
                atual.setProximo(null);
            }else if(atual == ultimo){
            this.ultimo= anterior;
            anterior.setProximo(null);
            }else{
                
            anterior.setProximo(atual.getProximo());
            atual = null;
            
            }
            this.tamanho --;
           break;
        } 
        anterior =atual;
         atual =atual.getProximo();
        }
}

    public void add(String valor, int index){
    Elemento temp= new Elemento(valor);
    Elemento current=primeiro;
    for(int i=1; i<index && current.getProximo() != null; i++){
        current=current.getProximo();
    }
    temp.setProximo(current.getProximo());
    current.setProximo(temp);
    
    tamanho++;
    }
public Elemento get(int posicao){
    Elemento atual = this.primeiro;
    for(int i=0; i< posicao;i++){
         if(atual.getProximo() != null){
             atual =atual.getProximo();           
    }
    }
    return atual;
}
} 