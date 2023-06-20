public class GerenciadorEquipamentos {

    private EquipamentosState equipamentosState;

    public GerenciadorEquipamentos() {
        equipamentosState = new EquipamentoDesligadoState();
    }

    public void setEquipamentosState(EquipamentosState state) {
        equipamentosState = state;
    }

    public void ligarEquipamento() {
        equipamentosState.ligar();
    }

    public void desligarEquipamento() {
        equipamentosState.desligar();
    }
}
