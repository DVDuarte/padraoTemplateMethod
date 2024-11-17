package org.padroesdeprojeto;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TreinamentoEmagrecimentoTest {

    @Test
    void deveRealizarTreinoDeEmagrecimento() {
        Treinamento treino = new TreinamentoEmagrecimento();
        String resultadoEsperado =
                "Aquecimento: corrida leve por 5 minutos.\n" +
                        "Exercícios principais: HIIT (treino intervalado de alta intensidade).\n" +
                        "Alongamento: alongamento de corpo inteiro por 10 minutos.\n";
        assertEquals(resultadoEsperado, treino.realizarTreino());
    }
}