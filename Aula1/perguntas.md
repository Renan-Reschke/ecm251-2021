1. Onde está instalado o JDK?
    - Windows: C:\Program Files\Java\jdk-15.0.2
    - Linux (Ubuntu): /usr/lib/jvm/jdk-15.0.2

2. Qual o caminho completo até o java e o javac?
    - java
        - Windows: C:\Program Files\Java\jdk-15.0.2
        - Linux (Ubuntu): /usr/lib/jvm/java-15-openjdk-amd64/bin/java
    - javac
        - Windows: C:\Program Files\Java\jdk-15.0.2
        - Linux (Ubuntu): /usr/lib/jvm/java-15-openjdk-amd64/bin/javac

3. Como compilamos um programa em linha de comando?
    - javac prog.java

4. Como executamos esse programa?
    - java prog
    
5. O que são variáveis de ambiente?
    - São valores nomeados dinamicamente que afetam o modo como processos em execução se comportam em um computador.
    - São atalhos visiíveis por todo o sistema, onde o sistema operacional e outros programas procuram por executáveis.

6. Qualquer um pode criar variáveis de ambiente?
    - Apenas usuários com permissão poodem alterar e criar variáveis de forma permanente (mudanças na execução atual podem ser realizadas por qualquer tipo de usuário).

7. Como criar uma variável de ambiente?
    - Windows:
        - Criar:
            - **Permanente**: setx VAR "dir" /M
            - **Exec. atual**: set VAR=dir
        - Alterar:
            - **Permanente**: setx VAR "%VAR%;dir" /M
            - **Exec. atual**: set VAR=%VAR%;dir
    - Linux (Ubuntu):
        - Criar:
            - export VAR=dir
        - Alterar:
            - export VAR=$VAR:dir

8. O que é JAVA_HOME?
    - Variável de ambiente que armazena o diretório do java.