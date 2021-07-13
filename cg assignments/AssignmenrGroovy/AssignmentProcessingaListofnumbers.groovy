package AssignmenrGroovy
//2.Processing a list of numbers Create a list of numbers. Add them together. First double each number, then add them up. Compute their average.
def nums=[145,65,36,71,453,11,32]
def sum=0
def sumd=0
println nums
for(i=0; i<7; i++) {
	sum=sum+nums[i]
}
println "Adding all numbers in list: "+sum

for(i=0; i<7; i++) {
	sumd=sumd+(nums[i]*nums[i])
}
println "Doubling and adding: "+sumd

def avg2=sum/7
def avg3=sumd/7

println "Average of numbers: "+avg2
println "Average of double numbers: "+avg3