package br.univali.es3.jogoquiz.entity;

public class RespostasPerguntas {

    private String resposta;
    private Boolean correta;

    public RespostasPerguntas(String answer, Boolean correct)
    {
        resposta = answer;
        correta = correct;
    }
    private String getResposta()
    {
        return resposta;
    }

    private Boolean getCorreta()
    {
        return correta;
    }
}
