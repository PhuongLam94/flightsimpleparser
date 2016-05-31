- This is a simple parser for a flight query which CFG below.

S → WH-QUERY FLIGHT-NP FLIGHT-VP\n
FLIGHT-NP → DET FLIGHT-CNP\n
FLIGHT-NP → FLIGHT-CNP\n
FLIGHT-CNP → FLIGHT-N\n
FLIGHT-CNP → FLIGHT-CNP FLIGHT-DEST\n
FLIGHT-TIME → TIME-MOD │P-TIME TIME-MOD\n
FLIGHT-VP → FLIGHT-V\n
FLIGHT-VP → FLIGHT-V FLIGHT-TIME\n
CITY-NP → CITY-NAME CITY-N\n
CITY-NP → DET CITY-N\n
FLIGHT-DEST → to CITY-NP\n
FLIGHT-DEST→ for CITY-NP\n
WH-QUERY → what time │ when does │ which\n
DET → the\n
FLIGHT-N→ flight\n
P-TIME → at │on │in\n
CITY-NAME → Ho Chi Minh | Hue\n
CITY-N → city\n
FLIGHT-V → arrives │ leave\n
TIME-MOD → 8:30HR │10:00HR │ 14:30HR │ 15:30HR │16:00HR\n

- Usage:
Enter the query and wait for program to parse and answer.

- Sample output:

Enter your sentence:
Which flight to Hue city arrives at 20:00HR ?

/=======================/
Stage 1: Parse to token\n
Successful\n
WH-QUERY FLIGHT-N TO CITY-NAME CITY-N FLIGHT-V P-TIME TIME-MOD
/=======================/
Stage 2: Parse to AST TREE\n
Successful\n
S(WH-QUERY(Which) FLIGHT-NP(FLIGHT-CNP(FLIGHT-CNP(FLIGHT-N(flight)) FLIGHT-DEST(TO(to) CITY-NP(CITY-NAME(Hue) CITY-N(city))))) FLIGHT-VP(FLIGHT-V(arrives) FLIGHT-TIME(P-TIME(at) TIME-MOD(20:00HR))))

/=======================/
Stage 3: Parse to predicate\n
(ARRIVE var001 (WHICH var003 &((FLIGHT var003)(TO var003 (&(NAME var005 "Hue")(CITY var005))))) (TIME var006 "20:00HR"))

/=======================/
Stage 4: Parse to procedure\n
(PRINT-ALL ?f (FLIGHT ?f) (ATTIME ?f Hue 20:00HR) (DTIME ?f ?s2 ?t2))

/=======================/
Stage 5: Answer question\n
[F3]
