package org.padroesdeprojeto;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class TreinamentoForcaTest {

    @Test
    void deveRealizarTreinoDeForca() {
        Treinamento treino = new TreinamentoForca();
        String resultadoEsperado =
                "Aquecimento: corrida leve por 5 minutos.\n" +
                        "Exercícios principais: levantamento de peso, supino, e agachamento.\n" +
                        "Alongamento: alongamento de corpo inteiro por 10 minutos.\n";
        assertEquals(resultadoEsperado, treino.realizarTreino());
    }
}