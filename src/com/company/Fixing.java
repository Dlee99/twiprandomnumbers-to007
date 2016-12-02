/*
Derek Lee to Tommy:

Your for loop to generate the tru array is as follows:
        for(int j = 0; j >= tru.length; j++){
            tru[j] = true;
        }
The for loop should look like:
        for(int j = 0; j < tru.length; j++){
            tru[j] = true;
        }
        because otherwise the for loop doesn't even run.
        Once you fix that, I'd recommend import java.util.* and using
        !Arrays.equals(numbers, tru)
        rather than 
        numbers != tru
        in your while loop.
