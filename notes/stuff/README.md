## Leetcode


```
Rating and Global Ranking are for contests, while Ranking is for the number of problems you have solved.

Rating and Global Ranking are updated after you take up a contest.
I've been watching my Ranking getting better with solving more problems.

Just to give an idea on number of problems to Ranking.
Problems solved : 438 / 1553
Ranking : 23916
```

## Continuous Integration Vs Continuous Deployment Vs Continuous Delivery


Continous Deployment

```

CI is a s/w engineering practice in which frequent,
isolated changes are immediately tested and reported on when they are added to a larger code base 

Remote -> Git -> CI Server ( Build + Test + Success/Failure ) -> Remote

If success rate is more than 90% CI server will send 
developer build artifact which will further be used for deployment

```


Continous Deployment

```
every change goes through an automated pipeline and a working version of application  is automatically pushed to production

build -> test -> acceptance testing -> deploy to staging area -> production area -> smoke testing
```

Continuous Delivery

```
helps to build a refined version of the s/w by continuously implementing fixes and feedback until 
finally we decide to push it out to production.
```




## Github Actions

```

Actions are reusable components

Github Actions Toolkit JS

Workflow glue together existing actions

listens for triggers
then run shell script's 
or pre existing script's 
actions run in Vm or docker

```

```
https://www.youtube.com/watch?v=uijgmwOdcXQ
```


```
https://github.com/marketplace/actions/github-action-for-digitalocean-doctl
```