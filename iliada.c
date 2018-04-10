#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#define FILE_READ "Iliad.txt"
int main(){
  FILE * f;
  int count[16],i=0;
  int k,j;
  char c;
  char *word;
  int result1,result2=1;
  char list[16][2][12] = {
    {"Jupiter","JUPITER"},
    {"Juno","JUNO"},
    {"Apollo","APOLLO"},
    {"Neptune","NEPTUNE"},
    {"Minerva","MINERVA"},
    {"Diana","DIANA"},
    {"Achilles","ACHILLES"},
    {"Vulcan","VULCAN"},
    {"Venus","VENUS"},
    {"Mars","MARS"},
    {"Hellen","HELLEN"},
    {"Pluto","PLUTO"},
    {"Ceres","CERES"},
    {"Paris","PARIS"},
    {"Hector","HECTOR"},
    {"Ajax","AJAX"}
  };
  f = fopen(FILE_READ,"r");
  if(f == NULL){
      printf("\nfile not found\n");
      return -1;
  }
  word = malloc(30*sizeof(char));

  for(k=0; k<16; k++)
  count[k] = 0;

  while(!feof(f)){
    fscanf(f,"%c",&c);
    if((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')){
      word[i]=c;
      i++;
    }
    else{
      word[i]='\0';
      i=0;
      for(k = 0; k < 16; k++){
      result1 = strcmp(word,list[k][1]);
      result2 = strcmp(word,list[k][0]);
      if(result1 == 0 || result2 == 0){
        count[k]++;
    }
    }
      //  printf("\n%s\n",word);

    //  printf("%s",word);
    }


  }

    printf("\nok\n");

for(k=0; k<16; k++)
  printf("\n%s  %d\n",list[k][0] ,count[k]);
  fclose(f);
  return 0;

}
