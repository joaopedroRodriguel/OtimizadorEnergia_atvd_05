public class EquipamentoDesligadoState implements EquipamentosState {

    @Override
    public void ligar() {
        System.out.println("Ligando os Equipamentos");
    }

    @Override
    public void desligar() {
        System.out.println(("Os equipamentos já estão desligados"));
    }
}
