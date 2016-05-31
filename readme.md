- This is a simple parser for a flight query which CFG below.

S → WH-QUERY FLIGHT-NP FLIGHT-VP
FLIGHT-NP → DET FLIGHT-CNP
FLIGHT-NP → FLIGHT-CNP
FLIGHT-CNP → FLIGHT-N
FLIGHT-CNP → FLIGHT-CNP FLIGHT-DEST
FLIGHT-TIME → TIME-MOD │P-TIME TIME-MOD
FLIGHT-VP → FLIGHT-V
FLIGHT-VP → FLIGHT-V FLIGHT-TIME
CITY-NP → CITY-NAME CITY-N
CITY-NP → DET CITY-N
FLIGHT-DEST → to CITY-NP
FLIGHT-DEST→ for CITY-NP
WH-QUERY → what time │ when does │ which
DET → the
FLIGHT-N→ flight
P-TIME → at │on │in
CITY-NAME → Ho Chi Minh | Hue
CITY-N → city
FLIGHT-V → arrives │ leave
TIME-MOD → 8:30HR │10:00HR │ 14:30HR │ 15:30HR │16:00HR

- Usage:
Enter the query and wait for program to parse and answer.

- Sample output:

Enter your sentence:
Which flight to Hue city arrives at 20:00HR ?

=======================
Stage 1: Parse to token
Successful
WH-QUERY FLIGHT-N TO CITY-NAME CITY-N FLIGHT-V P-TIME TIME-MOD
=======================
Stage 2: Parse to AST TREE
Successful
S(WH-QUERY(Which) FLIGHT-NP(FLIGHT-CNP(FLIGHT-CNP(FLIGHT-N(flight)) FLIGHT-DEST(TO(to) CITY-NP(CITY-NAME(Hue) CITY-N(city))))) FLIGHT-VP(FLIGHT-V(arrives) FLIGHT-TIME(P-TIME(at) TIME-MOD(20:00HR))))

=======================
Stage 3: Parse to predicate
(ARRIVE var001 (WHICH var003 &((FLIGHT var003)(TO var003 (&(NAME var005 "Hue")(CITY var005))))) (TIME var006 "20:00HR"))

=======================
Stage 4: Parse to procedure
(PRINT-ALL ?f (FLIGHT ?f) (ATTIME ?f Hue 20:00HR) (DTIME ?f ?s2 ?t2))

=======================
Stage 5: Answer question
[F3]
