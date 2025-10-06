# Login

Write a program that recognizes the following users:

| username | password |
|----------|----------|
| alex     | sunshine |
| emma     | haskell  | 

The program either shows a personal message or informs of an incorrect username or password.

<pre>
Enter username: alex
Enter password: sunshine
You have successfully logged in!
</pre>

<pre>
Enter username: emma
Enter password: haskell
You have successfully logged in!
</pre>

<pre>
Enter username: alex
Enter password: thunderstorm
Incorrect username or password!
</pre>

__NB!__ You can't compare strings with ==!

__NB!__ Logins should not be implemented like this in real life! You can become familiar with safer ways to implement logins on courses focusing on web programming.