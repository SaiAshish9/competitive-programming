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


Continous Integration

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

# Database transaction models: ACID VS BASE

```
The CAP theorem states that it is impossible to achieve both consistency (ACID) and availability (BASE) in a partition tolerant distributed system (i.e., a system which continues to work in cases of temporary communication breakdowns).


ACID Model
The ACID database transaction model ensures that a performed transaction is always consistent. This makes it a good fit for businesses which deal with online transaction processing (e.g., finance institutions) or online analytical processing (e.g., data warehousing). These organizations need database systems which can handle many small simultaneous transactions. There must be zero tolerance for invalid states.

ACID acronym standing for Atomic, Consistent, Isolated, Durable
ACID stands for:

Atomic – Each transaction is either properly carried out or the process halts and the database reverts back to the state before the transaction started. This ensures that all data in the database is valid.
Consistent – A processed transaction will never endanger the structural integrity of the database.
Isolated – Transactions cannot compromise the integrity of other transactions by interacting with them while they are still in progress.
Durable – The data related to the completed transaction will persist even in the cases of network or power outages. If a transaction fails, it will not impact the manipulated data.
ACID Use Case Example
Financial institutions will almost exclusively use ACID databases. Money transfers depend on the atomic nature of ACID.

Which Databases are ACID compliant?
One safe way to make sure your database is ACID compliant is to choose a relational database management system. These include MySQL, PostgreSQL, Oracle, SQLite, and Microsoft SQL Server.

The BASE Model
The rise of NoSQL databases provided a flexible and fluid way to manipulate data. As a result, a new database model was designed, reflecting these properties.

The acronym BASE is slightly more confusing than ACID. However, the words behind it suggest ways in which the BASE model is different.

BASE acronym standing for Basically Available, Soft state, Eventually consistent
BASE stands for:

Basically Available – Rather than enforcing immediate consistency, BASE-modelled NoSQL databases will ensure availability of data by spreading and replicating it across the nodes of the database cluster.
Soft State – Due to the lack of immediate consistency, data values may change over time. The BASE model breaks off with the concept of a database which enforces its own consistency, delegating that responsibility to developers.
Eventually Consistent – The fact that BASE does not enforce immediate consistency does not mean that it never achieves it. However, until it does, data reads are still possible (even though they might not reflect the reality).

BASE Use Case Example
Marketing and customer service companies who deal with sentiment analysis will prefer the elasticity of BASE when conducting their social network research. Social network feeds are not well structured but contain huge amounts of data which a BASE-modeled database can easily store.

Which Databases are Using the BASE Model?
Just as SQL databases are almost uniformly ACID compliant, NoSQL databases tend to conform to BASE principles. MongoDB, Cassandra and Redis are among the most popular NoSQL solutions, together with Amazon DynamoDB and Couchbase.
```

# WebRtc Vs AppRtc Vs WebSockets Vs gPRC

```

```

CPU Vs GPU

```

```

# MVP Vs MVC Vs MVVM

```

```

# Native Vs Hybrid Vs Cross Platform

```

```