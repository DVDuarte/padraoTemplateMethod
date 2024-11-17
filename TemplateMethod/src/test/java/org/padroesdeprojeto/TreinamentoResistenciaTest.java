package org.padroesdeprojeto;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TreinamentoResistenciaTest {

    @Test
    void deveRealizarTreinoDeResistencia() {
        Treinamento treino = new TreinamentoResistencia();
        String resultadoEsperado =
                "Aquecimento: corrida leve por 5 minutos.\n" +
                        "Exercícios principais: corrida intervalada e circuito funcional.\n" +
                        "Alongamento: alongamento de corpo inteiro por 10 minutos.\n";
        assertEquals(resultadoEsperado, treino.realizarTreino());
    }
}