# Code Challenge
OneLogin coding challenge

To run the program you need to:
 * Build docker image:
    * **docker build --tag challenge-app .**
 * Run the newly created docker container:
    * **docker run challenge-app 1/2 + 1/2**

You can also directly use the **fraction.sh** script if you have set up previously your java environment, 
you would just need to run it as follows (this way you won't need to create a docker image):
- **sh fraction.sh 1/2 + 1/2**

Please note character * is special, to represent the multiply operator you need to use character "x", for example:

**docker run challenge-app 1/2 x 1/2**
