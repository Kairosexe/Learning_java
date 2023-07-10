import java.util.Scanner;

public class Wham_Bam_Shang_A_Lang {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String letraCancion = "Starry nights, sunny days I always thought that love should be that way Then comes a time that you're ridden with doubt You've loved all you can and now you're all loved out Oh, oh, baby we've been a long, long way And who's to say, where we'll be tomorrow Well, my heart says, no But, my mind says, it's so That we've got a love Is it a love to stay We've got a wham, bam, shang a lang And a sha-la-la-la-la-la thing Wham, bam, shang a lang And a sha-la-la-la-la-la thing Looking at you I wanted to say I think a little emotion goes a long, long way Careful now don't get caught in no dreams Look out baby this is not what it seems Oh, oh, baby you've been so good to me But, please don't make it what it's not Well, I thought we agreed on what we need So listen to me and I'll tell you what we've got We've got a wham, bam, shang a lang And a sha-la-la-la-la-la thing Wham, bam, shang a lang And a sha-la-la-la-la-la thing I think you're seeing what I'm been saying 'Cause I hear you singing to the tune I'm playing Now that it's said and we both understand Let's say our goodbyes before it gets out of hand Bye, bye baby, I'd really like to stay But we'll remember the best time in our lives We had a wham, bam shang a lang And a sha-la-la-la-la-la thing Wham bam shang a lang And a sha-la-la-la-la-la thing Wham bam shang a lang And a sha-la-la-la-la-la thing";

        // String letraCancion = "Aquí va la letra de la canción de Enjambre";

        System.out.print("Ingresa una letra: ");
        // 'a', 't'. '2', '#'
        char letra = scanner.next().charAt(0);

        int contador = 0;
        // contador inicia en 0 y va hasta que se cumpla la siguiente condición ->
        // Condicion: i sea menor que la longitud de letracancion
        // incremento de i en i+1
        for (int i = 0; i < letraCancion.length(); i++) {

            if (Character.toLowerCase(letraCancion.charAt(i)) == Character.toLowerCase(letra)) {
                contador++;
            }
        }

        System.out.println("La letra '" + letra + "' aparece " + contador + " veces en la canción.");
    }

}
