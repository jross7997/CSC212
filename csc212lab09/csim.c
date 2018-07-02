/*Justin Ross
ID: 804546209
username: jross5 */

#include "cachelab.h"
#include <stdio.h>
#include <math.h>
#include <stdlib.h>
#include <ctype.h>
#include <string.h>
#include <getopt.h>

int hit =0;
int miss =0;
int eviction = 0;
int help = 0;
int verb = 0;
int setSize =0;
int associativity = 0;
int blockSize =0;
int numSetInd = 0;
int numBlockBits =0;

typedef struct {
long tag;
int set;
int valid;	
int lastUsed;
}line;

typedef struct {
	line** setLines;
}set;

typedef struct {
set** cacheSets;
}simCache;

simCache buildCache(numSets,assoc,numBlockBits){
	
	simCache tempCache;
	set tempSet;
	line tempLine;
	
	newCache.cacheSets = (set*)malloc(size
	
	
}


void helpPrint(char* argv[]){ //prints the help message.
	printf("Usage: %s [-hv] -s <num> -E <num> -b <num> -t <file>\n", argv[0]);
    printf("Options:\n");
    printf("  -h         Print this help message.\n");
    printf("  -v         Optional verbose flag.\n");
    printf("  -s <num>   Number of set index bits.\n");
    printf("  -E <num>   Number of lines per set.\n");
    printf("  -b <num>   Number of block offset bits.\n");
    printf("  -t <file>  Trace file.\n");
    printf("\nExamples:\n");
    printf("  %s -s 4 -E 1 -b 4 -t traces/yi.trace\n", argv[0]);
    printf("  %s -v -s 8 -E 2 -b 4 -t traces/yi.trace\n", argv[0]);
	exit(1);
}

int cacheLab(){
	//code
	 printSummary(hit,miss, eviction);
}

int verbPrint(){
	//code
}


int main(int argc, char *argv[])
{
	char *traceFile;
	if(argc < 8){
	helpPrint(argv);
	}else{
		//parse
		while(input=getopt(argc,argv,"hv:s:E:b:t")) != -1){
		switch(input){
			
			case 's':
			setSize = atoi(optarg);
			break;
			
			case 'E':
			associativity = atoi(optarg);
			break;
			
			case 'b':
			blockSize = atoi(optarg);
			break;
			
			case 't':
			traceFile = optarg;
			break;
			
			case 'h':
			helpPrint(argv);
			break;
			
			case 'v':
			verbPrint();
			break;
			
			default :
			helpPrint(argv);
			break;
		}
	}
	
	if(setSize ==0 || associativity == 0 || blockSize ==0 || traceFile == null){
		helpPrint();
	}
	
	numSetInd = pow(2,setSize);
	numBlockBits = pow(2,blockSize);
	

	
	}
	
		
   
    return 0;
           
}