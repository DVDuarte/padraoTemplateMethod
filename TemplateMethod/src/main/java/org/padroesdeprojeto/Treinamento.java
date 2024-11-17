package org.padroesdeprojeto;

public abstract class Treinamento {

    public final String realizarTreino() {
        StringBuilder treino = new StringBuilder();
        treino.append(aquecer());
        treino.append(realizarExerciciosPrincipais());
        treino.append(alongar());
        return treino.toString();
    }

    private String aquecer() {
        return "Aquecimento: corrida leve por 5 minutos.\n";
    }

    protected abstract String realizarExerciciosPrincipais();

    private String alongar() {
        return "Alongamento: alongamento de corpo inteiro por 10 minutos.\n";
    }
}