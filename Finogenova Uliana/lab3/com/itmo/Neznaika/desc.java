package com.itmo.Neznaika;

public enum desc {
    AROUND(" от начала и до конца, а потом в обратном порядке"),
    AFTER(", потом"),
    THIRDTIME("в третий раз"),
    FIN("Наконец "),
    NEAR(" возле "),
    IN(" в "),
    ONEOF(" одну из "),
    SUDDENLY("Неожиданно "),
    NOW("Теперь ");

    private String content;

    public String getContent() {
        return this.content;
    }

    private desc(String content){
        this.content = content;
    }
}