package javaProduction._1;

public record Persona(String name,int age,String indirizzo) {
    @Override
    public String toString() {
        return "Persona{" +
                "il nome è='" + name + '\'' +
                ", la sue età=" + age +
                ", il suo indirizzo civico è='" + indirizzo + '\'' +
                '}';
    }
}
