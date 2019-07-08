require 'Bowling'

RSpec.describe Bowling do
    it "scores a gutter game with 0" do
        bowling = Bowling.new

        bowling.roll(0);

        expect(bowling.score).to eq 0
    end
end

RSpec.describe Bowling do
    subject (:bowling) { described_class.new }

    it "scores a gutter game with 0" do
        bowling.roll(0);

        expect(bowling.score).to eq 0
    end
end