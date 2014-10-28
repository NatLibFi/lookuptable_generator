Look Up Table -generator 0.1
-----------------------------

DESCRIPTION

A script that generates USEMARCON Loop Up Table -files from Excel spreadsheets. This tool is best suited for parsing large amounts of value pairs such as lists of term translations. Note that, at the moment, the program only translates whitespaces and the most common Scandinavian characters into hex codes, as required by USEMARCON. See e.g. http://www.nationallibrary.fi/libraries/format/usemarcon.html for details on the USEMARCON software.

DEPENDENCIES

Perl, modules: Spreadsheet::Read, Spreadsheet::XLSX (if using xlsx-format), Spreadsheet::ReadSXC (for OpenOffice-/LibreOffice-format)

USAGE

Fill in the value pairs into a spreadsheet columns. Save the file. Edit the preferred settings into the script (input-/output-filenames, cells to read etc.). Run the script without arguments.

AUTHOR

Tuomo Virolainen <<tuomo.virolainen@helsinki.fi>>

COPYRIGHT AND LICENCE

Copyright (C) 2014 by The National Library of Finland

This library is free software; you can redistribute it and/or modify
it under the same terms as Perl itself, either Perl version 5.18.2 or,
at your option, any later version of Perl 5 you may have available.)
