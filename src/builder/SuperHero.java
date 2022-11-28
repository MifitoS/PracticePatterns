package builder;

import java.util.Set;

public class SuperHero {
    private String name;
    private String surname;
    private int age;
    private  int weight;
    private int height;
    private Set<SuperHero> superHeroes;

    public static class Builder{

        private SuperHero superHero;

        public Builder() {
            superHero = new SuperHero();
        }

        public Builder withName(String name){
            superHero.name = name;
            return this;
        }
        public Builder withSurname(String surname){
            superHero.surname = surname;
            return this;
        }
        public Builder withSuperHeroes(Set<SuperHero> superHeroes){
            superHero.superHeroes = superHeroes;
            return this;
        }

        public SuperHero build(){
            return superHero;
        }
    }
}
