-module(factoriel).
-export([fac/1, mult/2, convert/2]).

fac(1) ->
  1;

fac(N) ->
  N * fac(N-1).

mult(X, Y) ->
  X * Y.

convert(M, inch) ->
  M / 2.54.

convert_length({inch, X}) ->
  {centimeter, X / 2.54 }.


