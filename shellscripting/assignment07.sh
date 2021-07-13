#! /usr/bin/bash
shopt -s expand_aliases

alias TODAY="6/7/2021"
alias UFILES="find/home -user user"

TODAYSDATE="6/7/2021"
USERFILES='find/home-user user'

echo "Today's Date : $TODAYSDATE"
echo "user files  : $USERFILES"

A='TODAY'
B='UFILES'

echo "with Alias, TODAY IS: $A"
echo "with Alias, UFILES IS : $B"