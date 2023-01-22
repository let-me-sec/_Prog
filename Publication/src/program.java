public class program {
    public static void main(String[] args) {
        Publication pub = new Publication( "История транзистора.", 10, "Дорога к твердотельным переключателям была долгой. Она \n" +
                "началась с открытия того, что определенные материалы странно \n" +
                "ведут себя в присутствии электричества. В 1874 году Фердинанд \n" +
                "Браун опубликовал статью “О прохождении электрических токов \n" +
                "через сульфиды металлов”. И все завертелось…", "История",  "IT","электроника");
        Comment cm1 = new Comment(1,"Держите ссылку на то как работают светодиоды из карбида \n" +
                "кремния ввв.свет.ру");
        Comment cm2 = new Comment(0,"Спасибо!");
        Comment cm3 = new Comment(0,"Thanks!");
        Comment cm4 = new Comment(0,"Это перевод? Пойду оригинал почитаю");
        Comment cm5 = new Comment(0,"а где ссылка на оригинал?");
        Comment cm6 = new Comment(3," автор, добавь ссылку в начало статьи");
        Comment cm7 = new Comment(5,"Какую только дичь не писали в журналах 20-30гг пытаясь \n" +
                "объяснить работу кристаллического детектора.");
        pub.comments.add(cm1);
        cm1.addComment(cm2);
        cm1.addComment(cm3);
        pub.comments.add(cm4);
        cm4.addComment(cm5);
        cm5.addComment(cm6);
        pub.comments.add(cm7);
        System.out.println(pub);
    }
}