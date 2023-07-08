import javax.swing.JOptionPane;

public class Pessoa {
    private String name;
    private int idade;
    private float peso;
    private double altura;

    public Pessoa(){
        setName(JOptionPane.showInputDialog(null, "Insira o nome:").toString());
        setIdade(Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a idade")));
        setPeso(Float.parseFloat(JOptionPane.showInputDialog(null, "Insira o peso:")));
        setAltura(Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a altura")));
    }

    public Pessoa(String name, int idade, float peso, double altura){
        setName(name);
        setIdade(idade);
        setPeso(peso);
        setAltura(altura);
    }


    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }


    public void info(){
        JOptionPane.showMessageDialog(
            null,
            "Nome: " + getName() + 
            "\n Idade: " + getIdade() + 
            "\n Altura: " + getAltura() +
            "\n Peso: " + getPeso() 
        );
    }

    
}
