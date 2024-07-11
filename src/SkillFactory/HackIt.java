package SkillFactory;

import SkillFactory.module6.Secret;

public class HackIt extends Secret {
    public static void main(String[] args) {
        (new Hack()).hack();

    }
}
class Hack extends Secret{
    public void hack(){
        getSecret();
    }
}
