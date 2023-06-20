public class EquipamentoLigadoState implements EquipamentosState {

    @Override
    public void ligar() {
        System.out.println("Os equipamentos já estão ligados");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando os Equipamentos");
    }
}
