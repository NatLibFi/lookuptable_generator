Look Up Table -generator 0.1
-----------------------------

DESCRIPTION

A script that generates USEMARCON Loop Up Table -files from Excel spreadsheets. This tool is best suited for parsing large amounts of value pairs such as lists of term translations. Note that, at the moment, the program only translates whitespaces and the most common Scandinavian characters into hex codes, as required by USEMARCON. See e.g. [USEMARCON description page](http://www.nationallibrary.fi/libraries/format/usemarcon.html) for details on the software.

DEPENDENCIES
- Perl
- Spreadsheet::Read
- Spreadsheet::XLSX (for xlsx-format)
- Spreadsheet::ReadSXC (for OpenOffice-/LibreOffice-format)

USAGE

Fill in the value pairs into spreadsheet columns. Save the file. Edit the preferred settings into the script (input-/output-filenames, cells to read etc.). Run the script without arguments.
