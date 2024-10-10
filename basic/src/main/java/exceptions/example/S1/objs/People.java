package exceptions.example.S1.objs;

import exceptions.example.S1.AmbiguousVocaException;
import exceptions.example.S1.BadGrammarException;
import exceptions.example.S1.CouldNotCommunicateException;

public abstract class People implements Communicable {

    private final LanguageType motherTongue;
    private boolean hasTranslator = false;

    public People(LanguageType motherTongue) {
        this.motherTongue = motherTongue;
    }

    public People(LanguageType motherTongue, boolean hasTranslator) {
        this.motherTongue = motherTongue;
        this.hasTranslator = hasTranslator;
    }

    @Override
    public LanguageType getLanguaeType() {
        return motherTongue;
    }

    @Override
    public boolean hasTranslator() {
        return hasTranslator;
    }

    @Override
    public void communicate(Communicable other, String message) {
        try {
            makeSentence(other);
            System.out.println("성공적으로 의사소통 합니다!");
        } catch (BadGrammarException e ) {
            throw new CouldNotCommunicateException("정상적인 의사소통이 불가능합니다,", e);
//            throw new CouldNotCommunicateException("정상적인 의사소통이 불가능합니다,");
        }
    }

    private boolean canCommunicateWith(Communicable other) {
        LanguageType languaeType = other.getLanguaeType();
        return this.motherTongue.getType().equals(languaeType.getType()) || hasTranslator();
    }

    private void choiceVoca(Communicable other) throws AmbiguousVocaException{

        if ( !canCommunicateWith(other) ) {
            throw new AmbiguousVocaException("모호한 단어를 선택해서 이야기를 시작합니다.");
        }

        System.out.println("적절한 단어를 선택했습니다!");

    }

    private void makeSentence(Communicable other) throws BadGrammarException{

        try {
            choiceVoca(other);
            System.out.println("적절한 문장을 만들었습니다!");
        } catch (AmbiguousVocaException e) {
            throw new BadGrammarException("문법적으로 옳지 않은 문장을 만들기 시작했습니다.", e);
//            throw new BadGrammarException("문법적으로 옳지 않은 문장을 만들기 시작했습니다.");
        }

    }

}
