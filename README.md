Look Up Table -generator 0.1
-----------------------------

DESCRIPTION

A script that generates USEMARCON Loop Up Table -files from Excel spreadsheets. This tool is best suited for parsing large amounts of value pairs such as lists of term translations. Note that, at the moment, the program translates only whitespaces and the most common Scandinavian characters into hex codes, as required by USEMARCON. See e.g. http://www.nationallibrary.fi/libraries/format/usemarcon.html for details on the USEMARCON software.

DEPENDENCIES

Perl, Spreadsheet::Read -module, Excel-parser such as Spreadsheet::XLSX

USAGE

Fill in the value pairs into a spreadsheet columns. Save the file in xlsx-format. Edit the preferred settings into the script (input-/output-filenames, cells to read etc.). Run the script without arguments.

AUTHOR

Tuomo Virolainen <tuomo.virolainen@helsinki.fi>

COPYRIGHT AND LICENCE

Copyright (C) 2014 by The National Library of Finland

This library is free software; you can redistribute it and/or modify
it under the same terms as Perl itself, either Perl version 5.18.2 or,
at your option, any later version of Perl 5 you may have available.)
