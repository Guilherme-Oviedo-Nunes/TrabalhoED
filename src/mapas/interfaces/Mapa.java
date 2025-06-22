package mapas.interfaces;

/**
 * Interface que define as operações básicas de um Mapa.
 * A chave é usada para localizar um valor.
 * @param <C> Tipo da chave (neste trabalho, será o IMEI).
 * @param <V> Tipo do valor (neste trabalho, será o objeto Celular).
 */
public interface Mapa<C, V> {

    /**
     * Adiciona um par chave-valor ao mapa.
     * @param chave A chave para associar ao valor.
     * @param valor O valor a ser armazenado.
     */
    void incluir(C chave, V valor);

    /**
     * Retorna o valor associado a uma chave específica.
     * @param chave A chave a ser buscada.
     * @return O valor encontrado ou null se a chave não existir.
     */
    V obterValor(C chave); // 

    /**
     * Verifica se uma determinada chave está presente no mapa.
     * @param chave A chave a ser verificada.
     * @return true se a chave existe, false caso contrário.
     */
    boolean contemChave(C chave); // 

    /**
     * Retorna o número de pares chave-valor no mapa.
     * @return O tamanho do mapa.
     */
    int tamanho(); // 

    /**
     * Imprime todos os elementos do mapa em ordem.
     */
    void imprimir(); // 

    /**
     * Remove todos os celulares com IMEI igual ou inferior a um valor de referência.
     * Esta é uma operação específica do trabalho. 
     * @param chaveReferencia A chave de referência para a remoção.
     */
    void removerAbaixoDe(C chaveReferencia);

    /**
     * Conta quantos celulares são de uma marca específica.
     * Esta é uma operação específica do trabalho. 
     * @param marca A marca a ser contada.
     * @return O número de celulares da marca especificada.
     */
    int contarMarca(String marca);
}
